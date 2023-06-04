export class Animal {
    name : string ; 
    age : number ; 

    constructor(name : string  , age : number){
        this.name = name ;
        this.age = age;
    }

    echoName(){
        console.log(this.name);
    }

    getAge() : number {
        return this.age ;
    }
}