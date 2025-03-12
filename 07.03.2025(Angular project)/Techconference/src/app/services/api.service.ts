import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  private jsonUrl = 'assets/schedules.json'; // Adjust if needed

  constructor(private http: HttpClient) {}

  getSchedules(): Observable<any> {
    return this.http.get('http://localhost:4500/schedule');
  }
  getSpeakers(): Observable<any> {
    return this.http.get('http://localhost:4500/speakers');
  }
}
