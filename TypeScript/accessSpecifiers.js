var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Product = /** @class */ (function () {
    function Product(name, price) {
        this.n = 'siva';
        this.name = name;
        this.price = price;
    }
    Product.prototype.display = function () {
        console.log(this.name);
        console.log(this.price);
    };
    return Product;
}());
var product1 = new Product('Apple', 300000);
product1.display();
var ProductTax = /** @class */ (function (_super) {
    __extends(ProductTax, _super);
    function ProductTax(name, price, tax) {
        var _this = _super.call(this, name, price) || this;
        _this.tax = tax;
        return _this;
    }
    ProductTax.prototype.display = function () {
        _super.prototype.display.call(this);
        console.log(this.tax);
    };
    ProductTax.prototype.getNetPrice = function () {
        return this.price + this.price * this.tax / 100;
    };
    return ProductTax;
}(Product));
var pt = new ProductTax('Lenovo', 100000, 25);
pt.display();
pt.getNetPrice;
//console.log('The product name and price :'+pt.display())
console.log("The net price is " + pt.getNetPrice());
