
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from '../Model/Customer';
import { CustomerService } from '../service/customer.service';

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent implements OnInit{
  customers: Customer[]

  constructor(private customerService: CustomerService, private router: Router){}
   ngOnInit(): void{
      this.customerService.getAllCustomers().subscribe(data =>{
        this.customers = data;
      })

   }

   updateCustomer(customer: Customer): void{
     localStorage.removeItem('id');
     localStorage.setItem('id', customer.id.toString());
     this.router.navigate(['update-customer']);
   }

   deleteCustomer(customer: Customer): void{
     this.customerService.deleteCustomer(customer.id).subscribe();
     this.customers = this.customers.filter(c => c !== customer);
   }
  
}
