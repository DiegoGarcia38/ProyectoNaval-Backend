import { spawn } from 'child_process';

export default function handler(req, res) {
  res.setHeader('Access-Control-Allow-Origin', '*');
  
  if (req.method === 'GET') {
    // Simula llamar a tu lógica Java
    const mockData = [
      {
        id: 1,
        name: "Tugboat Alfa",
        type: "Tugboat",
        length: 25.5,
        beam: 8.2,
        draft: 3.1,
        power: 1200,
        status: "Active"
      }
    ];
    
    res.status(200).json(mockData);
  } else {
    res.status(405).json({ error: 'Method not allowed' });
  }
}