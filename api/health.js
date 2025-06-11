export default function handler(req, res) {
  // Configurar CORS
  res.setHeader('Access-Control-Allow-Origin', '*');
  res.setHeader('Access-Control-Allow-Methods', 'GET, POST, PUT, DELETE');
  res.setHeader('Access-Control-Allow-Headers', 'Content-Type');

  // Manejar preflight requests
  if (req.method === 'OPTIONS') {
    res.status(200).end();
    return;
  }

  if (req.method === 'GET') {
    // Health check endpoint
    const healthStatus = {
      status: 'UP',
      timestamp: new Date().toISOString(),
      service: 'Proyecto Naval Backend',
      version: '1.0.0',
      environment: process.env.NODE_ENV || 'production',
      uptime: process.uptime()
    };
    
    res.status(200).json(healthStatus);
  } else {
    res.status(405).json({ 
      error: 'Method not allowed',
      message: `${req.method} method is not supported on this endpoint`
    });
  }
}