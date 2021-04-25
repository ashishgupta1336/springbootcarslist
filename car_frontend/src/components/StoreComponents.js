import React from 'react';
import storecomponents from '../services/StoreServices';
import { Table,Navbar } from 'react-bootstrap';
class StoreComponents extends React.Component {

    constructor(props) {
        super(props)
        this.state = {
            tables: []
        }
    }
    componentDidMount() {
        storecomponents.getStores().then((Response) => {
            this.setState({ tables: Response.data })
        });
    }

    render() {
        return (
            <div>
                <Navbar bg = "info">
                    <Navbar.Brand href="#home">Car owners details</Navbar.Brand>
                    <Navbar.Toggle />
                    <Navbar.Collapse className="justify-content-end">
                        <Navbar.Text>
                            Signed in as: <a href="#login" >Ashish Gupta</a>
                        </Navbar.Text>
                    </Navbar.Collapse>
                </Navbar>
                <hr></hr>
                <Table striped bordered hover variant="dark">
                    <thead>
                        <tr>
                            <th>Car Id</th>
                            <th> Name</th>
                            <th> Email-Id</th>
                            <th> Mobile Number</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.tables.map(
                                table =>
                                    <tr key={table.id}>
                                        <td>{table.id}</td>
                                        <td>{table.carName}</td>
                                        <td>{table.emailId}</td>
                                        <td>{table.mobileNumber}</td>
                                    </tr>
                            )
                        }
                    </tbody>
                </Table>
            </div>
        )
    }
}

