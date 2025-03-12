import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SpeakerschildComponent } from './speakerschild.component';

describe('SpeakerschildComponent', () => {
  let component: SpeakerschildComponent;
  let fixture: ComponentFixture<SpeakerschildComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SpeakerschildComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SpeakerschildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
