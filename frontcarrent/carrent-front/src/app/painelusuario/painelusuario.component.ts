import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { VehicleService } from '../servico/vehicle.service';
import { Vehicle } from '../vehicle';

@Component({
  selector: 'app-painelusuario',
  standalone: true,
  imports: [CommonModule, FormsModule],
  providers: [VehicleService],
  templateUrl: './painelusuario.component.html',
  styleUrl: './painelusuario.component.css'
})

export class PainelusuarioComponent {
  // Variável para alugar veículo
  btnAlugar:boolean = true;

  // Variável para visibilidade da tabela
  tabela:boolean = true;

  // JSON de veículos
  vehicles:Vehicle[] = [];

  vehicle: Vehicle = {
    vehicleId: undefined,
    plate: '',
    model: '',
    brand: '',
    color: '',
    year: undefined,
    createdAt: '',
    currentRenterId: undefined
  };

  // Construtor que fará requisições à API
  constructor(private vehicleService: VehicleService) {}

  // Método de inicialização
  ngOnInit(){
    this.buscar();
  }

  // Método de seleção de todos os veículos
  selecionarTodos():void {
    this.vehicleService.selecionarTodos().subscribe(output => this.vehicles = output);
  }

  // Método de seleção de um veículo
  selecionarAlugar(vehicle: Vehicle):void {
    this.vehicle = vehicle;
    this.btnAlugar = false;
  }

  alugar(vehicle: Vehicle):void {
    vehicle.currentRenterId = 1;
    this.vehicleService.editarVeiculo(vehicle.vehicleId, vehicle).subscribe((output) => {
      this.btnAlugar = true;
      alert('Veículo alugado com sucesso');
      this.buscar();
    });
  }

  // Método de seleção de busca de veículos disponíveis
  buscar():void {
    const disponiveis = this.vehicleService.buscar().subscribe((output) => {
      this.vehicles = output
    });
  }
}
