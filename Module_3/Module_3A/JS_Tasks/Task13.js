// My Personal Library 2

const books = {
    title: 'The Summer Camp Secret',
    description: 'Story for Children',
    numberOfPages: 174,
    author: 'Mellisa J.M',
    reading: false,
    toggleReadingStatus: function(){
        if(books.reading === true){
            books.reading = false
        } else {
            books.reading = true
        }
    }
}

books.toggleReadingStatus()
console.log(books.reading)