import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Vehicle } from '../vehicle';

@Injectable({
  providedIn: 'root'
})
export class VehicleService {

  // Url da API
  private url:string = 'http://localhost:8080';

  // Construtor que fará requisições à API
  constructor(private http:HttpClient) { }

  // Método para obter todos os veículos
  selecionarTodos():Observable<Vehicle[]> {
    return this.http.get<Vehicle[]>(this.url + '/vehicles/false');
  }

  // Método para obter veículos disponíveis
  buscar():Observable<Vehicle[]> {
    return this.http.get<Vehicle[]>(this.url + '/vehicles/true');
  }

  // Método para adicionar veículo
  adicionarVeiculo(vehicle: any): Observable<any> {
    return this.http.post(this.url + '/vehicles/add', vehicle, {responseType: 'text'});
  }

  // Método para editar veículo
  editarVeiculo(vehicleId: number, vehicle: any): Observable<any> {
    return this.http.put<Vehicle>(`${this.url}/vehicles/${vehicleId}`, vehicle);
  }

  // Método para remover veículo
  removerVeiculo(vehicleId: number): Observable<any> {
    return this.http.delete(`${this.url}/vehicles/${vehicleId}`);
  }

}
