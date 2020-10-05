import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Persoon } from './persoon';

@Injectable({
  providedIn: 'root'
})
export class PersoonService {

  constructor(private http: HttpClient) { }

  getPersonen() {
    const url = '/rest/persoon';
    return this.http.get<Persoon[]>(url);
  }
}
