import { Component ,Input} from '@angular/core';

@Component({
  selector: 'app-speakerschild',
  standalone: false,
  templateUrl: './speakerschild.component.html',
  styleUrl: './speakerschild.component.css'
})
export class SpeakerschildComponent {
@Input() speakerList: any[] = [];
}
