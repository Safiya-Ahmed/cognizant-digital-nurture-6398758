// src/Posts.js
import React from 'react';
import Post from './Post';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: []
    };
  }

  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(res => res.json())
      .then(data => {
        // Check if Post is a function (constructor)
        if (typeof Post !== 'function') {
          alert('Error: Post is not a class or function.');
        }
        const postObjects = data.map(p => new Post(p.id, p.title, p.body));
        this.setState({ posts: postObjects });
      })
      .catch(err => {
        alert("Error loading posts: " + err);
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert('Error in Posts component: ' + error);
  }

  render() {
    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.map(post => (
          <div key={post.id}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
