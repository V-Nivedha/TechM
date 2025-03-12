import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SchedulechildComponent } from './schedulechild.component';

describe('SchedulechildComponent', () => {
  let component: SchedulechildComponent;
  let fixture: ComponentFixture<SchedulechildComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SchedulechildComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SchedulechildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
