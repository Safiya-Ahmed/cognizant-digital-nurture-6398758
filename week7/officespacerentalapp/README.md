
JSX (JavaScript XML) is a syntax extension for JavaScript that allows me to write HTML-like code directly inside JavaScript. It's used in React to describe the UI structure in a readable and intuitive way. JSX looks like HTML but gets compiled to React.createElement() behind the scenes.


ECMAScript (often abbreviated as ES) is the official standard that defines the rules and features of JavaScript. ES6 (ECMAScript 2015) was a major update that introduced features like let, const, arrow functions, classes, template literals, and more — making JavaScript more powerful and modern.


React.createElement() is a core React API that creates a virtual DOM node. It takes three arguments: the element type, optional properties (props), and children. 

To create React nodes using JSX, I simply write HTML-like tags inside a JavaScript function or component. 


JSX elements are rendered to the actual DOM using the ReactDOM.render() method. For example, ReactDOM.render(<App />, document.getElementById('root')) mounts the App component onto a real DOM node with the ID root.


I can embed JavaScript expressions inside JSX using curly braces {}. This lets me dynamically display values or perform logic. 

Inline CSS in JSX is applied using the style attribute, which takes a JavaScript object with camelCase property names. 
