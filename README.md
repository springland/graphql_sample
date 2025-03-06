A sample project for graphql

visit [Graphql playground](http://localhost:8080/graphiql)

### Add a book

mutation {
addBook(title: "Spring Boot with GraphQL", author: "John Doe") {
id
title
author
}
}

### Get All books

query {
getAllBooks {
id
title
author
}
}

### Get Book By ID
query {
getBookById(id: 1) {
id
title
author
}
}
