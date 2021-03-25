class Node:

    def __init__(self):
        self.data = (int) (1 + 10 * random.random());
        self.next = None

class LinkedList:

    def __init__(self, length):
        self.head = None
        self.length = length;


    def generateList(num):
        head = Node();
        
        self.head = head;
        self.length = num;

        for (x in range(num):
            newNode = Node()
            traverse = head

            if (head.next == None):
                head.next = newNode

            while (traverse.next != None):
                traverse = traverse.next

            traverse.next = newNode;
            newNode.next = None;

    

