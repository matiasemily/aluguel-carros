import { AfterViewInit, Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Vehicle } from '../vehicle';
import { VehicleService } from '../servico/vehicle.service';

@Component({
  selector: 'app-paineladmin',
  standalone: true,
  imports: [CommonModule, FormsModule],
  providers: [VehicleService],
  templateUrl: './paineladmin.component.html',
  styleUrl: './paineladmin.component.css'
})

export class PaineladminComponent implements AfterViewInit {

  // Variável para cadastro
  btnCadastro:boolean = true;

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
  constructor(private vehicleService: VehicleService) {  }

  // Método de seleção de todos os veículos
  selecionarTodos():void {
    this.vehicleService.selecionarTodos().subscribe(output => this.vehicles = output);
  }

  // Método de seleção de um veículo
  selecionarVeiculo(posicao:number):void {
    this.vehicle = this.vehicles[posicao];
    this.btnCadastro = false;
  }

  // Método de inicialização
  ngOnInit(){
    this.selecionarTodos();
  }

  // Método de atualização
  ngAfterViewInit(): void {
    this.selecionarTodos();
  }

  // Início do CRUD no front
  cadastrar(vehicle: Vehicle) {
    this.vehicleService.adicionarVeiculo(vehicle).subscribe((output) => {
      this.vehicles.push(vehicle);
      alert(output)
      this.vehicle = {
        vehicleId: undefined,
        plate: '',
        model: '',
        brand: '',
        color: '',
        year: undefined,
        createdAt: '',
        currentRenterId: undefined
      };
      this.selecionarTodos();
    })
  }

  editar(vehicle: Vehicle) {
    const vehicleId = vehicle.vehicleId;
    this.vehicleService.editarVeiculo(vehicleId, this.vehicle).subscribe((output) => {
      this.selecionarTodos();
      this.btnCadastro = true;
      alert('Veículo alterado com sucesso');
    });
  }

  remover(vehicle: Vehicle) {
    this.vehicleService.removerVeiculo(vehicle.vehicleId).subscribe((output) => {
      this.selecionarTodos();
      alert('Veículo excluído com sucesso')
    })
  }

  cancelar():void {
    this.vehicle = {
      vehicleId: undefined,
      plate: '',
      model: '',
      brand: '',
      color: '',
      year: undefined,
      createdAt: '',
      currentRenterId: undefined
    };
    this.btnCadastro = true;
  }
  
}
