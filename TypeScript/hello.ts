var global=10;
class Scopes{
    static staticVariable=20;
    instanceVariable=30;

    display(){
        var localValue = 10;
        console.log('local:' +localValue);
        console.log('Static:' +Scopes.staticVariable);
        console.log('Instance:' +this.instanceVariable);
        console.log('Global:' +global);

    }

    // display2(){
    //     console.log('local:' +localValue);
    //     console.log('Static:' +Scopes.staticVariable);
    //     console.log('Instance:' +this.instanceVariable);
    //     console.log('Global:' +global);

    }
}

var obj = new Scopes();
obj.display();
// obj.display2();