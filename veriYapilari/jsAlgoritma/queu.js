// https://github.com/shrutikapoor08/javascript-algorithms


class Queue {
    constructor() {
        this.items = []
    };

    enqueue(item){
        return this.items.push(item);
    }

    dequeue() {
        if(this.isEmpty()) throw "Cannot remove from empty queue";
        return this.items.shift();
    }

    isEmpty() {
        return this.items.length === 0;
    }

    front(){
        return this.items[0];
    }

    printQueue(){
        this.items.forEach( i => console.log(i))
    }

}

const q = new Queue();
q.enqueue(2);
q.enqueue(6);
q.enqueue(4);
q.printQueue(8)