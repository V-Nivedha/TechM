import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'scheduleFilter',
  standalone: false
})
export class ScheduleFilterPipe implements PipeTransform {
  transform(schedules: any[], searchTerm: string): any[] {
    if (!schedules || !searchTerm) {
      console.log("No search term, returning all schedules", schedules);
      return schedules;
    }

    searchTerm = searchTerm.toLowerCase();
    const filteredSchedules = schedules.filter(schedule =>
      schedule.title.toLowerCase().includes(searchTerm) ||
      schedule.track?.toLowerCase().includes(searchTerm)
    );

    console.log("Filtered schedules:", filteredSchedules);
    return filteredSchedules;
  }
}
