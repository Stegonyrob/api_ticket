import axios from 'axios';

export function getIncidents() {
 return axios.get('http://localhost:8080/api/incidents/findAll');
}

export function getIncident(id) {
 return axios.get(`http://localhost:8080/api/incidents/find/${id}`);
}

export function createIncident(incident) {
 return axios.post('http://localhost:8080/api/incidents/save', incident);
}

export function updateIncident(id, incident) {
 return axios.put(`http://localhost:8080/api/incidents/update/${id}`, incident);
}

export function deleteIncident(id) {
 return axios.delete(`http://localhost:8080/api/incidents/delete/${id}`);
}
