import './App.css';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import { books } from './components/Data';

function App() {
  return (
    <div className="container">
      <div className="column">
        <CourseDetails />
      </div>
      <div className="divider" />
      <div className="column">
        <BookDetails books={books} />
      </div>
      <div className="divider" />
      <div className="column">
        <BlogDetails />
      </div>
    </div>
  );
}

export default App;
