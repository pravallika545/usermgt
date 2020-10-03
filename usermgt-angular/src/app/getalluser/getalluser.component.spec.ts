import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetalluserComponent } from './getalluser.component';

describe('GetalluserComponent', () => {
  let component: GetalluserComponent;
  let fixture: ComponentFixture<GetalluserComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GetalluserComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GetalluserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
