 // src/components/BookDetails.js
function BookDetails(props) {
  const booklist = (
    <ul>
      {props.books.map((book) => (
        <div key={book.id}>
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </ul>
  );

  return (
    <div className="s12">
      <h1>Book Details</h1>
      {booklist}
    </div>
  );
}

export default BookDetails;

