import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductListComponentV3 } from './productlist-v3';

describe('ProductlistV3', () => {
  let component: ProductListComponentV3;
  let fixture: ComponentFixture<ProductListComponentV3>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ProductListComponentV3]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProductListComponentV3);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
