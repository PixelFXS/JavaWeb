function loadTasks() {
    axios.get('/api/task')
        .then(response => {
            const tasks = response.data;
            const taskList = document.getElementById('taskList');
            taskList.innerHTML = '';

            tasks.forEach((task, index) => {
                const row = `
                    <tr>
                        <td>${index + 1}</td>
                        <td>${task.name}</td>
                        <td>${task.description}</td>
                        <td>${task.date}</td>
                    </tr>
                `;
                taskList.innerHTML += row;
            });
        })
        .catch(error => {
            alert('Failed to load tasks');
            console.error("Error loading tasks:", error);
        });
}
window.onload = loadTasks;
