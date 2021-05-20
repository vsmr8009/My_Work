import { Customer } from './../model/customer';

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class CustomerService {

  baseURL = 'http://localhost:8080/api/customers';
  constructor(private httpClient: HttpClient) { }

  getAllCustomers(): Observable<Customer[]>{
    return this.httpClient.get<Customer[]>(this.baseURL);
  }

  createCustomer(customer: Customer): Observable<Customer>{
    return this.httpClient.post<Customer>(this.baseURL, customer)
  }

  getCustomerById(id: number): Observable<Customer>{
    return this.httpClient.get<Customer>(this.baseURL+'/'+ id);
  }

  deleteCustomer(id: number): Observable<Customer>{
    return this.httpClient.delete<Customer>(this.baseURL+'/'+id);
  }

  updateCustomer(customer: Customer): Observable<Customer>{
    return this.httpClient.put<Customer>(this.baseURL+'/'+customer.id, customer);
  }
}
