import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SpeakersComponent } from './speakers.component';

describe('SpeakersComponent', () => {
  let component: SpeakersComponent;
  let fixture: ComponentFixture<SpeakersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SpeakersComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SpeakersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
