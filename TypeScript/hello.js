var global = 10;
var Scopes = /** @class */ (function () {
    function Scopes() {
        this.instanceVariable = 30;
        // display2(){
        //     console.log('local:' +localValue);
        //     console.log('Static:' +Scopes.staticVariable);
        //     console.log('Instance:' +this.instanceVariable);
        //     console.log('Global:' +global);
    }
    Scopes.prototype.display = function () {
        var localValue = 10;
        console.log('local:' + localValue);
        console.log('Static:' + Scopes.staticVariable);
        console.log('Instance:' + this.instanceVariable);
        console.log('Global:' + global);
    };
    Scopes.staticVariable = 20;
    return Scopes;
}());
var obj = new Scopes();
obj.display();
// obj.display2();
