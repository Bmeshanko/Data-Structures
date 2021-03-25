class Node:

    def __init__(self):
        self.data = (int) (1 + 10 * random.random());
        self.next = None

class LinkedList:

    def __init__(self):
        self.head = None
        self.length = 0;


    def generateList(num):
        head = Node();
        
        self.head = head;
        self.length = num;

        for x in range(num):
            newNode = Node()
            traverse = head

            if (head.next == None):
                head.next = newNode

            while (traverse.next != None):
                traverse = traverse.next

            traverse.next = newNode;
            newNode.next = None;
    
    def toString(self):
        traverse = Node();
        s = "";
        for x in range(self.length):
            if (i < self.length - 1):
                s += traverse.data + " -> "
            else:
                s += traverse.data
            traverse = traverse.next
        return s;
             
    if __name__ == "__main__":
        list = LinkedList();
        list.generateList(10);
        print(list.toString());
        


