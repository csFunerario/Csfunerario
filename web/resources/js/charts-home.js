$(document).ready(function () {

    'use strict';

    // Main Template Color
    var brandPrimary = '#33b35a';


    // ------------------------------------------------------- //
    // Line Chart
    // ------------------------------------------------------ //
    var LINECHART = $('#lineCahrt');
    var myLineChart = new Chart(LINECHART, {
        type: 'line',
        options: {
            legend: {
                display: false
            }
        },
        data: {
            labels: ["Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul","Ago"],
            datasets: [
                {
                    label: "N° transacciones",
                    fill: true,
                    lineTension: 0.3,
                    backgroundColor: "rgba(78, 47, 138, 0.4)",
                    borderColor: brandPrimary,
                    borderCapStyle: 'butt',
                    borderDash: [],
                    borderDashOffset: 0.0,
                    borderJoinStyle: 'miter',
                    borderWidth: 1,
                    pointBorderColor: brandPrimary,
                    pointBackgroundColor: "#fff",
                    pointBorderWidth: 1,
                    pointHoverRadius: 5,
                    pointHoverBackgroundColor: brandPrimary,
                    pointHoverBorderColor: "rgba(220,220,220,1)",
                    pointHoverBorderWidth: 2,
                    pointRadius: 1,
                    pointHitRadius: 0,
                    data: [50, 55, 60, 51, 52, 62, 70, 67],
                    spanGaps: true
                },

            ]
        }
    });


    // ------------------------------------------------------- //
    // Pie Chart
    // ------------------------------------------------------ //
    var PIECHART = $('#pieChart');
    var myPieChart = new Chart(PIECHART, {
        type: 'doughnut',
        data: {
            labels: [
                "Pendientes",
                "Realizadas",
                "En tramite"
            ],
            datasets: [
                {
                    data: [30, 50, 100],
                    borderWidth: [1, 1, 1],
                    backgroundColor: [
                        brandPrimary,
                        "rgba(99, 27, 135, 0.7)",
                        "#FFCE56"
                    ],
                    hoverBackgroundColor: [
                        brandPrimary,
                        "rgba(99, 27, 152, 0.9)",
                        "#FFCE56"
                    ]
                }]
        }
    });

});
