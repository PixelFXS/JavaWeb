function saveTask() {
    const name = document.getElementById('name').value;
    const description = document.getElementById('description').value;
    const date = document.getElementById('date').value;

    console.log("Attempting to register task:", { name, description, date });

    axios.post('/api/new', {
        name: name,
        description: description,
        date: date
    })
    .then(response => {
        console.log(response.data);
        alert('Task successfully registered');
        document.getElementById('taskForm').reset();
    })
    .catch(error => {
        console.error("Error registering task:", error);
        alert('Failed to register the task');
    });
}
