import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PaineladminComponent } from './paineladmin.component';

describe('PaineladminComponent', () => {
  let component: PaineladminComponent;
  let fixture: ComponentFixture<PaineladminComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PaineladminComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(PaineladminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
