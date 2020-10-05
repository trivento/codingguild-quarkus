import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Persoon } from './persoon';

@Injectable({
  providedIn: 'root'
})
export class PersoonService {

  constructor(private http: HttpClient) { }

  getPersonen() {
    const url = './assets/mocks/persoon.json';
    return this.http.get<Persoon[]>(url);
  }
}
