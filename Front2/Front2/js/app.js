document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('userForm');
    const userId = document.getElementById('userId');
    const name = document.getElementById('name');
    const apellido = document.getElementById('apellido');
    const telefono = document.getElementById('telefono');
    const email = document.getElementById('email');
    const userTable = document.getElementById('userTable').getElementsByTagName('tbody')[0];
    const messageDiv = document.getElementById('message');

    const apiUrl = 'http://localhost:8080/';

    form.addEventListener('submit', async (event) => {
        event.preventDefault();
        const user = {
            name: name.value,
            apellido: apellido.value,
            telefono: telefono.value,
            email: email.value
        };

        let response;
        if (userId.value) {
            response = await updateUser(userId.value, user);
        } else {
            response = await createUser(user);
        }

        form.reset();
        userId.value = '';
        if (response.ok) {
            showMessage('Operacion exitoza');
        } else {
            showMessage('Error en la operacion');
        }
        loadUsers();
    });

    async function loadUsers() {
        const response = await fetch(apiUrl);
        const users = await response.json();
        userTable.innerHTML = '';
        users.forEach(user => {
            const row = userTable.insertRow();
            row.insertCell(0).textContent = user.id;
            row.insertCell(1).textContent = user.name;
            row.insertCell(2).textContent = user.apellido;
            row.insertCell(3).textContent = user.telefono;
            row.insertCell(4).textContent = user.email;

            const actions = row.insertCell(5);
            const editButton = document.createElement('button');
            editButton.textContent = 'Editar';
            editButton.addEventListener('click', () => editUser(user));
            actions.appendChild(editButton);

            const deleteButton = document.createElement('button');
            deleteButton.textContent = 'Eliminar';
            deleteButton.addEventListener('click', () => deleteUser(user.id));
            actions.appendChild(deleteButton);
        });
    }

    async function createUser(user) {
        const response = await fetch(apiUrl, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(user)
        });
        return response;
    }

    async function updateUser(id, user) {
        const response = await fetch(`${apiUrl}/${id}`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(user)
        });
        return response;
    }

    async function deleteUser(id) {
        const response = await fetch(`${apiUrl}/${id}`, {
            method: 'DELETE'
        });
        loadUsers();
        return response;
    }

    function editUser(user) {
        userId.value = user.id;
        name.value = user.name;
        apellido.value = user.apellido;
        telefono.value = user.telefono;
        email.value = user.email;
    }
    function showMessage(message, type) {
        messageDiv.textContent = message;
        messageDiv.className = type;
        messageDiv.estilos.display = 'block';
        setTimeout(() => {
            messageDiv.estilos.display = 'none';
        }, 3000);
    }

    loadUsers();
});
