import IAnimal from "./Animal.interface";
import { Animal } from "./Animal";

export class Dog extends Animal implements IAnimal {
    breed : string ; 

    constructor(name : string , age : number , breed : string){
        super(name , age)
        this.breed = breed
    }
    
    speak(sound: string): string {
         return sound + " " + "Woo woo" ;
    }
}