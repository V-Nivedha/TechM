import { Component } from '@angular/core';
import { ApiService } from '../../services/api.service';
@Component({
  selector: 'app-speakers',
  standalone: false,
  templateUrl: './speakers.component.html',
  styleUrl: './speakers.component.css'
})
export class SpeakersComponent {
  speakers:any[]=[]
  constructor(private apiService: ApiService) {}
  ngOnInit(): void {
    this.apiService.getSpeakers().subscribe(data => {
      this.speakers = data;
    });
  }
}
