import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PersoonLijstComponent } from './persoon-lijst.component';

describe('PersoonLijstComponent', () => {
  let component: PersoonLijstComponent;
  let fixture: ComponentFixture<PersoonLijstComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PersoonLijstComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PersoonLijstComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
