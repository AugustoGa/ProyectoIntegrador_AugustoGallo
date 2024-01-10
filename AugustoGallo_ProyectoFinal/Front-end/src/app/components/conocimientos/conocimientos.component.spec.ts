import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConocimientosComponent } from './conocimientos.component';

describe('ConocimientosComponent', () => {
  let component: ConocimientosComponent;
  let fixture: ComponentFixture<ConocimientosComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ConocimientosComponent]
    });
    fixture = TestBed.createComponent(ConocimientosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
