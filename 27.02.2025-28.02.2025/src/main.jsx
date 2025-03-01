import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import ABComponent2 from './uid.jsx'
import Ex from './Example.jsx'
import Paris from './Paris.jsx'
import Maldives from './Maldives.jsx'
import Contact from './Contact/Contact.jsx'
createRoot(document.getElementById('root')).render(
  <StrictMode>

<Ex />
<Paris />
<Maldives />
<ABComponent2 />

  </StrictMode>,
)
