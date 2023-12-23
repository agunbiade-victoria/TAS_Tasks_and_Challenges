const books = [
    {
        title: 'The Summer Camp Secret',
        description: 'Fictional',
        numberOfPages: 174,
        author: 'Melissa J.M',
        reading: false
    },
    {
        title: 'The Secret of Good Marriage',
        description: 'Motivational',
        numberOfPages: 593,
        author: 'Benjamin Godsent',
        reading: true      
    },
    {
        title: 'The Rich Man and The Poor Man',
        description: 'Non-fictional',
        numberOfPages: 207,
        author: 'Richard Mensah',
        reading: false     
    },
    {
        title: 'The Power House',
        description: 'Motivational',
        numberOfPages: 345,
        author: 'Japhet N.M',
        reading: false      
    }
];

for(let i = 0; i < books.length; i++){
    if(books[i].reading === true){
        console.log(books[i])
    }
}