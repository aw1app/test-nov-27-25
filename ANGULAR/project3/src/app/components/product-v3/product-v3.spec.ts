import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductV3 } from './product-v3';

describe('ProductV3', () => {
  let component: ProductV3;
  let fixture: ComponentFixture<ProductV3>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ProductV3]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProductV3);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
