import { CUSTOMERS } from './../customer-mock';
import { Injectable } from '@angular/core';
import { Customer } from '../Model/Customer';

@Injectable()
export class CustomerService {

  constructor() { }

  getAllCustomers(){
    return CUSTOMERS;
  }
}
