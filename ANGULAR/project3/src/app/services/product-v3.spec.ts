import { TestBed } from '@angular/core/testing';

import { ProductV3 } from './product-v3';

describe('ProductV3', () => {
  let service: ProductV3;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ProductV3);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
