There are different ways I can do conditional rendering in React:

if-else statements: Best for more complex conditions before returning JSX.

Ternary operator (? :): Used inside JSX to toggle between two elements.

Logical AND (&&): Used to render something only if a condition is true.

Switch statement: For handling multiple conditions cleanly.


I can render multiple components by placing them together inside a parent component. Either use a <div> or React Fragment (<>...</>) to group them.


A list component is a reusable component that displays a list of data items using .map(). It helps organize data better and makes the UI more dynamic.



Keys are unique identifiers used when rendering lists. They help React efficiently update and manage elements. Without proper keys, React may mess up the DOM updates.


When I extract a list item into a separate component, I still need to pass the key to the component element, not inside the component itself.


In React, the map() function is commonly used to render lists. It loops through an array and returns a JSX element for each item.

