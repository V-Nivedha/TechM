import { Component ,Input} from '@angular/core';
import { ScheduleFilterPipe } from '../../../pipes/schedule-filter.pipe';
@Component({
  selector: 'app-schedulechild',
  standalone: false,
  templateUrl: './schedulechild.component.html',
  styleUrl: './schedulechild.component.css'
})
export class SchedulechildComponent {
  @Input() searchTerm: string = '';
  @Input() scheduleList: any[] = [];
}
