import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddProductV3 } from './add-product-v3';

describe('AddProductV3', () => {
  let component: AddProductV3;
  let fixture: ComponentFixture<AddProductV3>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AddProductV3]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddProductV3);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
