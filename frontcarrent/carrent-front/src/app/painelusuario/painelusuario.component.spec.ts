import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PainelusuarioComponent } from './painelusuario.component';

describe('PainelusuarioComponent', () => {
  let component: PainelusuarioComponent;
  let fixture: ComponentFixture<PainelusuarioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PainelusuarioComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(PainelusuarioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
