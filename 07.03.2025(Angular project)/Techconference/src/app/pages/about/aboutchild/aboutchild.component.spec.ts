import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AboutchildComponent } from './aboutchild.component';

describe('AboutchildComponent', () => {
  let component: AboutchildComponent;
  let fixture: ComponentFixture<AboutchildComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AboutchildComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AboutchildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
