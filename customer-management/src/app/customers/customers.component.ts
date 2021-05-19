
import { Component, OnInit } from '@angular/core';
import { Customer } from '../Model/Customer';
import { CustomerService } from '../service/customer.service';

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent implements OnInit{
  customers: Customer[]

  constructor(private customerService: CustomerService){}
   ngOnInit(): void{
      this.customerService.getAllCustomers().subscribe(data =>{
        this.customers = data;
      })

   }
  
}
