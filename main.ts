import { Dog } from "./oop/ts-oop/Dog"

const main = () => {
    const dog : Dog = new Dog("Ballo" ,2 , "German Sheperd") 

    dog.echoName() 

    console.log(dog.speak("Gbo-gbo"))
}

main() 