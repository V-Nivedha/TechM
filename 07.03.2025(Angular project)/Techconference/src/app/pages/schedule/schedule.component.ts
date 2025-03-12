import { Component } from '@angular/core';
import { ApiService } from '../../services/api.service';

@Component({
  selector: 'app-schedule',
  standalone: false,
  templateUrl: './schedule.component.html',
  styleUrl: './schedule.component.css'
})
export class ScheduleComponent {
  schedules: any[] = [];
  searchTerm: string = ''; 

  constructor(private apiService: ApiService) {}

  ngOnInit(): void {
    this.apiService.getSchedules().subscribe(data => {
      this.schedules = data;
    });
  }
}
