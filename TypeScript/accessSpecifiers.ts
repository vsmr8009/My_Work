class Product{
    readonly n = 'siva'
    protected name : string
    protected price : number
    constructor(name:string, price:number){
        this.name=name
        this.price=price
    }

    display(){
        console.log(this.name)
        console.log(this.price)
    }

}

let product1 = new Product('Apple', 300000)
product1.display()


class ProductTax extends Product{
    protected tax:number

    constructor(name:string, price:number, tax:number){
        super(name, price)
        this.tax=tax
    }

    display(){
        super.display()
        console.log(this.tax)
    }

    getNetPrice(){
        return this.price+this.price*this.tax/100
    }

}

let pt = new ProductTax('Lenovo', 100000, 25)
pt.display()
pt.getNetPrice
//console.log('The product name and price :'+pt.display())
console.log("The net price is "+pt.getNetPrice())