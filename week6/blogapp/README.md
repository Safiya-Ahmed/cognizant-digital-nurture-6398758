The component lifecycle in React lets you control what happens when a component is created, updated, or removed. It’s useful for tasks like fetching data, updating the UI, or cleaning up. Knowing the lifecycle helps you write cleaner, more efficient code and improves app performance.

In class components, React provides lifecycle methods like componentDidMount, shouldComponentUpdate, and componentWillUnmount. These let you run specific code during mounting, updating, and unmounting phases.

When a component loads, React runs these steps:
First, the constructor runs, then render shows the UI, and componentDidMount is called after it's added to the page. On updates, it may call shouldComponentUpdate, re-render with render, and then componentDidUpdate. Before removal, componentWillUnmount runs for cleanup.

